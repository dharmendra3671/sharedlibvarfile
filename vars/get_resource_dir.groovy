 def runMyPython(){
     final pythonContent = libraryResource('Pythonzip.py')
     writeFile (file: 'Pythonzip.py', text: pythonContent)
     bat "python Pythonzip.py"
}

