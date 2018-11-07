package org;


def sayHello() {
	echo "Hello World"
	sh 'echo Hola'
}

def checkOutFrom(repo) {
  git url: "git@github.com:jenkinsci/${repo}"
}


@Grab('org.apache.commons:commons-math3:3.4.1')
import org.apache.commons.math3.primes.Primes

void parallelize(int count) {
  if (!Primes.isPrime(count)) {
    error "${count} was not prime"
  }
  // …
}

return this