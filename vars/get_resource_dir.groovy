import groovy.transform.SourceURI
import java.nio.file.Path
import java.nio.file.Paths

class ScriptSourceUri {
    @SourceURI
    static URI uri
}

def call() {
    Path scriptLocation = Paths.get(ScriptSourceUri.sourceUri)
    return scriptLocation.getParent().resolve('resources/Scripts').toString()
}
