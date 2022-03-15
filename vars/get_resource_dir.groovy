def get_resource(){
    def functionsContent = libraryResource("zipjf.py")
    writeFile (file: 'zipjf.py', text: functionsContent)
    bat "python zipjf.py"
}

return this
