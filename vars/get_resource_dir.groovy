 def runMyPython(){
     final pythonContent = libraryResource('zipjf.py')
     writeFile (file: 'zipjf.py', text: pythonContent)
     bat "python zipjf.py"
}

