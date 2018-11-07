package org;


def sayHello() {
	echo "Hello World"
	sh 'echo Hola'
}

def checkOutFrom(repo) {
  git url: "git@github.com:jenkinsci/${repo}"
}

return this