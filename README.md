![Sparta](/Assets/Git_Hub/SPARTALOGO.png)

# Welcome to Sparta Global 

**Table of Contents**

<!-- TOC START min:2 max:3 link:true asterisk:false update:true -->
- [Welcome](#welcome)
- [Pre-requisites](#pre-requisites)
- [How to use this repo?](#how-to-use-this-repo)
  - [Branching Strategy](#branching-strategy)
  - [Fork Repo](#fork-repo)
  - [Clone Repo](#clone-repo)
  - [Trainer Updates](#trainer-updates)
  - [Pulling updates from Trainer](#pulling-updates-from-trainer)
  - [Submitting Homework (pull-requests)](#submitting-homework-pull-requests)
  - [Topic Notes](#topic-notes)
- [Your course](#your-course)
- [Raising Issues](#raising-issues)
<!-- TOC END -->





## Welcome
It is really great to have you on board as part of one of the training courses here at `Sparta Global`. This repository has been set up with all the things you are going to need during training. We are going to be taking you through how this should be used to get the most out of your training while you are here.

## Pre-requisites
* GitHub Account
* Sparta Global Account

## How to use this repo?
This repository should be your first port of call for everything you do technically at Sparta. You will see a list of directories above which will come in useful when you start to work your way through the course.

__We advise you keep focused on the week you are on and do your best to complete all the tasks that you are given.__

Your group will be working on their own branch of this repo and contributing together.

### Branching Strategy

Please follow these instructions to use the repository most effectively through your training:

### Fork Repo
Click on the `fork` button on the top right hand corner. This is going to create a copy of this repo in your own GitHub domain. This is where you are going to do all your work during training.

![Fork](/Assets/Git_Hub/fork.png)

Once you have chosen to fork the repo you will see your name is now prefixed to the repo and you will see `forked from spartaglobal/repo name`. This means you have successful set up your repo.

![Your Version](/Assets/Git_Hub/your_version.png)

### Clone Repo
The next step is to `clone` your repo so yo can start to work on your training.

![clone](/Assets/Git_Hub/gitclonefork.png)

### Trainer Updates
During the course your trainer will be creating a `branch` that you are your colleagues will be collaborating to.

> TRAINER NOTE: Create a branch from the main repo that is name <group>-<stream> for example `eng01-devops`. Protect this branch to pushes and require pull requests.

![Protect](/Assets/Git_Hub/trainerProtections.png)

To gain access to this branch that the trainers has just created you can run the following commands:

```bash
git remote add upstream https://github.com/spartaglobal/SpartaGlobalJavaSDETCourse.git
git fetch upstream
git checkout --track Eng61
# you only need to track the first time you link to the upstream. After this, you simply use `git checkout Eng61`
```
If you are using 2 factor authentication, you will need to set up a ssh-key and run the following

```bash
git remote add upstream git@github.com:spartaglobal/SpartaGlobalJavaSDETCourse.git
git fetch upstream
git checkout --track Eng61
# you only need to track the first time you link to the upstream. After this, you simply use `git checkout Eng61`
```

This will add a direction to the Sparta Repo and then retrieve all the new information you need to access the same branch your trainer is adding lesson notes and labs too. Finally you will `checkout` to the working branch. You will not be able to push to the `upstream` branch as its protected. So don't worry about breaking anything.

### Pulling updates from Trainer

If your trainer has added any new content that you need to use follow the following steps to get that code:

```bash
# make sure you have commited any work you need and push to your origin repo.
git checkout Eng61
git status
# If your branch is behind use a 'git pull' to bring your work up to date

# check change to be commited
git add .
git commit -m "meaningful message"
git push

# pull content from trainner
git fetch upstream
git merge upstream/<group>
```

You will be asked to merge this code:
![Protect](/Assets/Git_Hub/mergegit.png)

```bash
# To save this merge, all you need to do is press the following keys:

# esc
# :wq
# enter
```
You will now be able to see the latest code from your trainer in your local `branch`. You are up to date.

### Submitting Homework (pull-requests)

When you come to submitting your homework you trainer will direct you to the the submission folder. You will see a `Submission` folder in the lab you are working on. This is where to work on your exercise.

As part of the training you will be expected to submit your work on a regular basis. This is going to be done through a pull request to our main `Sparta Repo`.

Follow the steps below to submit you work.

```bash
git add <files>
# make regular commits
git commit -m 'descriptive message'
# push to your repo on GitHub
git push origin <group>-<stream>
```

You will be able to see that your code is now viewable on `GitHub`.

![Protect](/Assets/Git_Hub/pushinghw.png)

When you are ready to submit your work. Click the `Compare & pull request` button to make your submission. You will need to select the following setting:

`base repository`: spartaglobal/class-repo   
`base`: your-class-branch   
`head repository`: yourgithub/class-repo   
`base repository`: class-repo

Once you have added a title and description added your trainer as a `Reviewer` click `Create pull request`

![Pull](/Assets/Git_Hub/PullrequesytHW.png)

Your trainer will now be able to see you homework / exercise submission. Please make sure you have delivered your work on time.

### Topic Notes

Every topic has a dedicated `MARKDOWN` file that your group will be able use to review topic notes but also for you to add your notes for the course as you go. Your group will be able contribute to these notes so if you have made some great notes they may merged in your class repo.

## Your course
You can find an overview of your course [here](https://github.com/spartaglobal/SpartaGlobalDevOpsCourse/projects/1) and the course intro [here](./00_Course_Introduction/DevOps.md) here.

## Raising Issues
At any point throughout the course, we would you like you to raise any technical issues through the functionality in this Repo. We have supplied you with a template to use for this:

![Pull](/Assets/Git_Hub/issue.png)

1. Click on `Issues` in the navigation bar
2. Click the GREEN  `New issue` button on the right
3. Click `Get started` on the `Question Template`
3. Fill in the template, remember to your research before you raise a question. Lets get into good habbits
6. Once you are finished click `Submit new issue`
