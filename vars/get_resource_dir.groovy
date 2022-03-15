 def runMyPython(){
     final pythonContent = libraryResource('sharelibjf-zip.py')
     writeFile (file: 'sharelibjf-zip.py', text: pythonContent)
  
     final jsonContent = libraryResource('config.json')
     writeFile (file: 'config.json', text: jsonContent)
     bat "python sharelibjf-zip.py"
}

