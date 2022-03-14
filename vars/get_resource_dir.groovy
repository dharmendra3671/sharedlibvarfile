import groovy.transform.SourceURI
import java.nio.file.Path
import java.nio.file.Paths

class ScriptSourceUri {
    @SourceURI URI sourceUri
}

def call() {
    Path scriptLocation = Paths.get(ScriptSourceUri.sourceUri)
    return scriptLocation.getParent().getParent().resolve('resources/Scripts').toString()
}
