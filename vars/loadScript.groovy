def call(Map config = [:]) { 
  def scriptcontents = libraryResource "Scripts/${config.name}"    
  writeFile file: "${config.name}", text: scriptcontents 
} 
