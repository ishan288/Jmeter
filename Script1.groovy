node {
  stage 'Run JMeter Test'
  sh 'C:/Users/isingla/Downloads/apache-jmeter-5.1/bin/jmeter.sh -n -t C:/Users/isingla/Desktop/myproject/Jmeter1.jmx -Jusers=10 -l test.jtl'
}