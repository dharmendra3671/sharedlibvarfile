def get_resource(){
    def functionsContent = libraryResource("artjf.py")
    writeFile (file: '/tmp/functions.sh', text: functionsContent)
    bat "python artjf.py"
}

return this
