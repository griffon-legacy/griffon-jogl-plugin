packagingType = ''
eventPackageStart = { type ->
    packagingType = type
}

def eventClosure1 = binding.variables.containsKey('eventCopyLibsEnd') ? eventCopyLibsEnd : {jardir->}
eventCopyLibsEnd = { jardir ->
    eventClosure1(jardir)
    if (!isPluginProject) {
        ant.fileset(dir: "${getPluginDirForName('jogl').file}/lib", includes: "*.jar").each {
            if(it.name =~ /griffon.jogl.addon.*/) {
                griffonCopyDist(it.toString(), jardir)
            }
        }

        if(!(packagingType in ['applet', 'webstart'])) {
            ant.fileset(dir: "${getPluginDirForName('jogl').file}/lib", includes: "*.jar").each {
                griffonCopyDist(it.toString(), jardir)
            }
            def joglLibDir = "${getPluginDirForName('jogl').file}/lib".toString()
            copyPlatformJars(joglLibDir, jardir)
            copyNativeLibs(joglLibDir, jardir)
        }
    }
}
