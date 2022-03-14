def call(Map config = [:]) {
    //def filelst=["Pythonzip.py","sharelibjf-zip.py"]
    loadScript(name:"Pythonzip.py")
    python "./Pythonzip.py ${config.name}"
    loadScript(name:"sharelibjf-zip.py")
    python "./sharelibjf-zip.py ${config.name}"
    }
