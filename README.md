# README

The following are required:

- JDK 1.8
- Ammonite

Should also have plugins (scala, sbt, rainbow brackets, and scalafmt)

1. Create a new private github repo named `myid-ip-mentoring-space` via [https://github.com/new](https://github.com/new).
   
   Example: My private repository would be named `mmynsted-ip-mentoring-space`.
   Notice the url for this new private repo where it says quick setup.

2. Create a bare repo and push it to the new.

```bash
git clone --bare git@github.com:inner-product/ip-mentoring-space.git 
cd ip-mentoring-space
```

Find the URL for your private folk from the first step and populate it.

```bash
git push --mirror git@github.com:mmynsted/mmynsted-ip-mentoring-space.git 
```

3. Remove the local `ip-mentoring-space` repo.
 
4. Clone your new _private fork_ locally
 
```bash
git clone git@github.com:mmynsted/mmynsted-ip-mentoring-space.git
```

5. _OPTIONAL_: Click on the settings tab of your private fork and add `mmynsted` as a collaborator.