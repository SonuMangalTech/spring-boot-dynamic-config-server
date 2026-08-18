Dynamic Config Server

Spring Cloud Config Server for centralized and dynamic configuration management in Spring Boot microservices.

Features
Centralized configuration using Spring Cloud Config
GitHub-based configuration repository
Externalized application.yml
Runtime configuration refresh using @RefreshScope
Multi-instance configuration refresh using Spring Cloud Bus and Kafka

Architecture

GitHub Config Repo
↓
Config Server :8888
↓
Spring Boot Services
↓
@RefreshScope

For multiple instances:
GitHub
↓
Config Server
↓
Spring Cloud Bus
↓
Kafka
↓
┌──────┬──────┬──────┐
S1     S2     S3

Configuration

Configure the Git repository in application.yml:
server:
port: 8888

spring:
  cloud:
    config:
      server:
        git:
          uri: https://github.com/<username>/dynamic-config-repo.git
          default-label: main

Related Repository

Config Repository:

dynamic-config-repo
└── application.yml

Config Client:

dynamic-config

This project demonstrates how to change application configuration without restarting Spring Boot services, including configuration refresh across multiple instances.