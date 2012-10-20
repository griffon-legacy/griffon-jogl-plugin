/*
 * Copyright 2009-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres Almiray
 */
class JoglGriffonPlugin {
    // the plugin version
    String version = '1.0.0'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '1.0.0 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [swing: '1.0.0']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = ['swing']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-jogl-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = "Render 3D content with JOGL"
    String description = '''
Provides integration with [JOGL][1], the Java™ Binding for the OpenGL® API ([JSR 231][2]).

Usage
-----

The following nodes will become available on a View script upon installing this plugin

| *Node*   | *Type*                            |
| -------- | --------------------------------- |
| glcanvas | `javax.media.opengl.awt.GLCanvas` |
| glpanel  | `javax.media.opengl.awt.GLJPanel` |

### Example

A trivial example can be found at [https://github.com/aalmiray/griffon_sample_apps/tree/master/3d/jogl][3]. It is the Gears
demo running inside a Griffon application.

[1]: http://jogamp.org/
[2]: http://jcp.org/en/jsr/detail?id=231
[3]: https://github.com/aalmiray/griffon_sample_apps/tree/master/3d/jogl
'''
}
