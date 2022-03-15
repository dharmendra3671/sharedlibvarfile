 def runMyPython(){
     final pythonContent = libraryResource('sharelibjf-zip.py')
     writeFile (file: 'sharelibjf-zip.py', text: pythonContent)
  
     final jsonContent = libraryResource('artifact_jf.json')
     writeFile (file: 'artifact_jf.json', text: jsonContent)
     bat "python sharelibjf-zip.py"
}
def runpythonScripts(){
     final pythonContent = libraryResource('Pythonzip.py')
     writeFile (file: 'Pythonzip.py', text: pythonContent)
  
     final jsonContent = libraryResource('config.json')
     writeFile (file: 'config.json', text: jsonContent)
     bat "python Pythonzip.py"
}

