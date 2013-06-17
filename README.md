
Render 3D content with JOGL
---------------------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/jogl](http://artifacts.griffon-framework.org/plugin/jogl)


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

