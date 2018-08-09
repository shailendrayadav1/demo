**Local Kubernetes setup with minikube on VirtualBox and local Docker registry :**

Prerequisites -
````
kubectl
docker
minikube
virtualbox
````
Udemy K8 course for beginner would help.

Otherwise run :
`brew install kubectl && brew cask install docker minikube virtualbox`

**Steps** -
0. To use Minikube's built-in docker daemon : 
`eval $(minikube docker-env)`


1. Build a docker image 
`docker build . --tag demo`



2. Publish it to local registry 
`docker tag demo localhost:5000/demo:0.1.0`


3. Deploy and run in Minikube cluster 
`kubectl create -f demo.yml`

<br/>
Some handy commands to work with minikube

````
minikube start --bootstrapper=localkube --insecure-registry=localhost:5000
minikube service <service-name> --url
minikube dashboard
minikube stop
minikube delete

kubectl get all
kubectl delete deploy demo
kubectr delete service demo

docker images
docker ps
docker rmi <image>``