#!/bin/bash
ssh centos@ec2-54-201-247-249.us-west-2.compute.amazonaws.com 'sudo service tomcat stop'
ssh centos@ec2-54-201-247-249.us-west-2.compute.amazonaws.com 'sudo rm -rf /opt/mount1/tomcat/webapp/*'
ssh centos@ec2-54-201-247-249.us-west-2.compute.amazonaws.com 'sudo service tomcat start'
ssh centos@ec2-54-201-247-249.us-west-2.compute.amazonaws.com 'sudo service tomcat status'
