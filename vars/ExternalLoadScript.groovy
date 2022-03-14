def call(Map config = [:]) {
    //def filelst=["Pythonzip.py","sharelibjf-zip.py"]
    loadScript(name:"Pythonzip.py")
    bat "./Pythonzip.py ${config.name}"
    loadScript(name:"sharelibjf-zip.py")
    bat "./sharelibjf-zip.py ${config.name}"
    }
