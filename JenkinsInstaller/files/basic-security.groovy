#!groovy
import jenkins.model.*
import hudson.security.*
import hudson.util.*;
import jenkins.install.*;

def instance = Jenkins.getInstance()

println "--> creating local user 'admin'"
instance.setInstallState(InstallState.INITIAL_SETUP_COMPLETED)

def strategy = new AuthorizationStrategy.Unsecured()
instance.setAuthorizationStrategy(strategy)
instance.save()
