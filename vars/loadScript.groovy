def call(Map config = [:]) { 
  def scriptcontents = libraryResource "${config.name}"    
  writeFile file: "${config.name}", text: scriptcontents 
} 
