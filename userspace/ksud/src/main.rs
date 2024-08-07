mod apk_sign;
mod assets;
mod cli;
mod debug;
mod defs;
mod event;
mod ksu;
mod ksucalls;
mod module;
mod mount;
mod profile;
mod restorecon;
mod sepolicy;
mod utils;

fn main() -> anyhow::Result<()> {
    cli::run()
}
