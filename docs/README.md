# KernelSU on Arm32

> [!WARNING]
> This KernelSU is not yet stable! I don't recommend it as main root method!

![KernelSU banner](https://github.com/rsuntk/rsuntk/blob/main/ksu_banner.png)

[![latest release badge](https://img.shields.io/github/v/release/Rissu-Projekt/KernelSU-ARM32?label=Release&logo=github)](https://github.com/tiann/KernelSU/releases/latest)
[![weblate](https://img.shields.io/badge/Localization-Weblate-teal?logo=weblate)](https://hosted.weblate.org/engage/kernelsu)
[![Channel](https://img.shields.io/badge/Follow-Telegram-blue.svg?logo=telegram)](https://t.me/KernelSU)
[![License: GPL v2](https://img.shields.io/badge/License-GPL%20v2-orange.svg?logo=gnu)](https://www.gnu.org/licenses/old-licenses/gpl-2.0.en.html)
[![GitHub License](https://img.shields.io/github/license/tiann/KernelSU?logo=gnu)](/LICENSE)


## Features

1. Kernel-based `su` and root access management.
2. Module system based on [OverlayFS](https://en.wikipedia.org/wiki/OverlayFS).
3. [App Profile](https://kernelsu.org/guide/app-profile.html): Lock up the root power in a cage.

## Compatibility State

### Kernel compatibility
- `KPROBES` support on this KernelSU already removed.
- Support non-GKI kernel from 4.4 to 4.19

### Module compatibility
- ZygiskOnKernelSU support currently in stale position. Previously it was working fine.
- Doesn't support ZygiskNext.

### Manager compatibility
- Have `armeabi-v7a` or Arm32 support

## Known issue
- Certain apps may crash while using umount module. Disable it to fix it.
- Opening profile template screen can crash the Manager.
- SEPolicy related issue.
  
## Usage

- [Installation Instruction](https://kernelsu.org/guide/installation.html)
- [How to build?](https://kernelsu.org/guide/how-to-build.html)
- [Official Website](https://kernelsu.org/)

## Discussion

- Telegram: [@KernelSU](https://t.me/KernelSU)

## Security
For information on reporting security vulnerabilities in KernelSU, see [SECURITY.md](/SECURITY.md).

## License

- Files under the `kernel` directory are [GPL-2.0-only](https://www.gnu.org/licenses/old-licenses/gpl-2.0.en.html)
- All other parts except the `kernel` directory are [GPL-3.0-or-later](https://www.gnu.org/licenses/gpl-3.0.html)

## Credits

- [tiann](https://github.com/tiann) - Original KernelSU author, owner, and maintainer
- [KernelSU](https://github.com/tiann/KernelSU) - Official KernelSU repository
