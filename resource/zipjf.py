import os
import glob

from artifactory import ArtifactoryPath
url='http://127.0.0.1:8082/artifactory/Zipfile_Artifactory/'
path = ArtifactoryPath(url,auth=('admin', 'Kumar@6805'))
path.touch()

def filename():
    os.chdir(r'D:\Test')
    for file in glob.glob("*.zip"):
        if os.path.exists(file):
            return file


path.deploy_file(filename())
