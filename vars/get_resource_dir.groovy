 def runMyPython(){
     final pythonContent = libraryResource('Pythonzip.py')
     writeFile (file: 'Pythonzip.py', text: pythonContent)
  
     final jsonContent = libraryResource('config.json')
     writeFile (file: 'config.json', text: jsonContent)
     //bat "python config.json"
}

