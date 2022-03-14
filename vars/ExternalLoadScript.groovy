def call(Map config = [:]) {
    def filelst=["Pythonzip.py","sharelibjf-zip.py"]
    for i in filelst:
        loadScript(name:i)
        python "./i${config.name}"
    }
