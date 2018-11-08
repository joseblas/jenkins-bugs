package org;


def sayHello(String name = "Phil") {
	echo "Hello World ${name}"
}

def checkOutFrom(script, repo) {
	 sayHello(" gitted")
  script.git url: "git@github.com:jenkinsci/${repo}"
  sayHello(" gitted")
}


@Grab('org.apache.commons:commons-math3:3.4.1')
import org.apache.commons.math3.primes.Primes

void parallelize(int count) {
	this.sayHello(count)
  if (!Primes.isPrime(count)) {
    error "${count} was not prime"
  }
  // …
}

return this