// for deploying... 
def runMyPython(){
     def pythonContent = libraryResource('sharelibjf-zip.py')
     writeFile (file: 'sharelibjf-zip.py', text: pythonContent)
  
     def jsonContent = libraryResource('artifact_jf.json')
     writeFile (file: 'artifact_jf.json', text: jsonContent)
     bat "python sharelibjf-zip.py"
}
// for building .....
def runpythonScripts(){
     def pythonContent = libraryResource('Pythonzip.py')
     writeFile (file: 'Pythonzip.py', text: pythonContent)
  
     def jsonContent = libraryResource('config.json')
     writeFile (file: 'config.json', text: jsonContent)
     bat "python Pythonzip.py"
}

