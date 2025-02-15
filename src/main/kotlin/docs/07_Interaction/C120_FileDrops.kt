@file:Suppress("UNUSED_EXPRESSION")
@file:Title("File Drops")
@file:ParentTitle("인터랙션")
@file:Order("120")
@file:URL("interaction/fileDrops")

package docs.`07_Interaction`

import org.openrndr.application
import org.openrndr.dokgen.annotations.*

fun main() {

    @Text
    """
    # File drops

    OPENRNDR programs can listen to file drop events. File drop events are generated by a user dragging and releasing one or more file icons onto the program window.
    """

    @Code
    application {
        program {
            window.drop.listen {
                println("${it.files.size} files dropped at ${it.position}")
            }
        }
    }
}