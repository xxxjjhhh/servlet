servlet
===

servlet Repository


jdk
---

<pre><code>
java -version

sudo apt update
sudo apt install default-jdk

//compile
//javac file.java
//ls
//java file
</pre></code>

tomcat
---

<pre><code>
sudo apt-cache search tomcat

sudo apt update
sudo apt install tomcat9
sudo apt install tomcat9-docs
sudo apt install tomcat9-user
sudo apt install tomcat9-admin
sudo apt install tomcat9-examples

//ps -ef | grep tomcat
//sudo find / -name webapps
</pre></code>


tomcat systemctl : ubuntu
---

<pre><code>
sudo systemctl start tomcat9
sudo systemctl restart tomcat9
sudo systemctl stop tomcat9
systemctl status tomcat9
</pre></code>

tomcat config
---

<pre><code>
cd /var/lib/tomcat9/conf/server.xml

</pre></code>

***
