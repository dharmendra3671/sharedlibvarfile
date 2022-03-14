def call(Map config = [:]) {
    
    loadScript(name: "Pythonzip.py")
    loadScript(name: "sharelibjf-zip.py")
    python "./Pythonzip.py"
   }
sh "./hello-world.sh ${config.name} ${config.dayOfWeek}"
