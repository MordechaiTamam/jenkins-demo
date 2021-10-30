# jenkins-demo
* Prepare and run:<br>
<code>
cd jenkins-demo<br>
docker-compose build<br>
docker-compose up -d<br>
</code>

* In order to grab the initial password:<br>
<code>
docker exec my-jenkins-3 bash -c "cat /var/jenkins_home/secrets/initialAdminPassword"
</code>

* Initial/simple pipeline can be found at the pipeline.groovy file