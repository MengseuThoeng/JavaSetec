#!/bin/bash

# Add all changes
git add .

# Get current date and time
current_datetime=$(date +"%Y-%m-%d %H:%M:%S")

# Commit with current date and time as the message
git commit -m "$current_datetime"

# Push the changes
git push
