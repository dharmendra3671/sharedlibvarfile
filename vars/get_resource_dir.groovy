def get_resource(){
   // final pythonContent = libraryResource('zipjf.py')
   // writeFile (file: 'zipjf.py', text: pythonContent)
    //bat "python zipjf.py"
    def task = "python zipjf.py".execute()
    task.waitFor()
}

return this
