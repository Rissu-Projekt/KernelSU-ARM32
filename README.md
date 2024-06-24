# KernelSU for Arm32 based devices
Ported by [Rissu](https://github.com/rsuntk)

I personally didn't recommend this as main root method.

# Compatibility
This KernelSU have native `armeabi-v7a` support.

Support non-GKI Kernel from 4.4 to 4.19.

Not support GKI Kernel anymore since GKI kernel is impossible to
have 32bit version. Support for `KPROBE` also dropped.

# How to add this KernelSU
- Latest tag (stable)
```sh
curl -LSs "https://raw.githubusercontent.com/Rissu-Projekt/KernelSU-ARM32/main/kernel/setup.sh" | bash -
```
- Main branch (dev)
```sh
curl -LSs "https://raw.githubusercontent.com/Rissu-Projekt/KernelSU-ARM32/main/kernel/setup.sh" | bash -s main
```
- Read the hookpatch in the hookpatch folder

# Credits
- [KernelSU](https://github.com/tiann/KernelSU) - Original KernelSU base
- [weishu](https://github.com/tiann) - The author of KernelSU
