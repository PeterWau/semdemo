# Software Engineering Methods - Demo

- Developer Build Status ![GitHub Workflow Status (with branch)](https://img.shields.io/github/actions/workflow/status/peterwau/semdemo/main.yml?branch=develop)
- Master Build Status ![GitHub Workflow Status (with branch)](https://img.shields.io/github/actions/workflow/status/peterwau/semdemo/main.yml?branch=master)
- License ![LICENSE](https://img.shields.io/github/license/PeterWau/semdemo.svg?style=flat-square)
- Release [![Releases](https://img.shields.io/github/release/PeterWau/semdemo/all.svg?style=flat-square)](https://github.com/PeterWau/semdemo/releases)

# Notes

## Building
___
- Remove target folder
- Build project - Build/build project
- Maven build
    - Lifecycle/compile
    - Lifecycle/package (should create jar with deps file in target)

## Run
- run docker-compose.yml

## Committing and Cleaning Up
___
- Update the version number in Maven and the Dockerfile.
- Merge the feature branch into develop.
- Merge develop into release.
- Create the release - including version tag.
- Merged release into master.
- Merged release into develop.
- Clean up Docker containers and images.