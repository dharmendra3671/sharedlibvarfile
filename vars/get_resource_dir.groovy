def get_resource(){
    final pythonContent = libraryResource('resource/zipjf.py')
    writeFile (file: 'zipjf.py', text: pythonContent)
    bat "python zipjf.py"
}

return this
