# libvec
My simple vector math library

## Publishing
To publish, your GitHub package credentials must be stored in gradle's settings file:

```
# ~/.gradle/gradle.properties

gh_user=<username>
gh_packages_token=<token>
```

The token can be generated from your [developer settings](https://help.github.com/en/github/authenticating-to-github/creating-a-personal-access-token-for-the-command-line).

With the settings set, run:
```sh
./gradlew publish
```

## API docs
The API docs can be found [HERE](https://ewpratten.github.io/libvec/)