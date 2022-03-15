def get_resource(){
    def pythonContent = libraryResource('zipjf.py')
    writeFile (file: 'zipjf.py', text: pythonContent)
    bat "python zipjf.py"
}

return this
