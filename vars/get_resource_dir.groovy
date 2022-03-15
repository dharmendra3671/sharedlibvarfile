def get_resource(){
    final functionsContent = libraryResource('zipjf.py')
    writeFile (file: 'zipjf.py', text: functionsContent)
    bat """python zipjf.py"""
}

return this
