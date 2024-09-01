#!/bin/bash

awslocal dynamodb create-table \
    --table-name TaskAudit \
    --attribute-definitions \
        AttributeName=taskId,AttributeType=S \
        AttributeName=eventId,AttributeType=S \
    --key-schema \
        AttributeName=taskId,KeyType=HASH \
        AttributeName=eventId,KeyType=RANGE \
    --provisioned-throughput ReadCapacityUnits=5,WriteCapacityUnits=5
