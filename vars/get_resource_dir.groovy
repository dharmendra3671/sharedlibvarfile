 def runMyPython(){
     final pythonContent = libraryResource('sharelibjf-zip.py')
     writeFile (file: 'sharelibjf-zip.py', text: pythonContent)
  
     final jsonContent = libraryResource('artifact_jf.json')
     writeFile (file: 'artifact_jf.json', text: jsonContent)
     bat "python sharelibjf-zip.py"
}

