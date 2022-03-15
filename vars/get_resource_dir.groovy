 def runMyPython(){
     final pythonContent = libraryResource('resources/zipjf.py')
     writeFile (file: 'zipjf.py', text: pythonContent)
     bat "python zipjf.py"
}

