use anyhow::Result;
use const_format::concatcp;
use rust_embed::RustEmbed;

use crate::{defs::BINARY_DIR, utils};

pub const RESETPROP_PATH: &str = concatcp!(BINARY_DIR, "resetprop");
pub const BUSYBOX_PATH: &str = concatcp!(BINARY_DIR, "busybox");

#[derive(RustEmbed)]
#[folder = "bin/arm"]
struct Asset;

pub fn ensure_binaries(ignore_if_exist: bool) -> Result<()> {
    for file in Asset::iter() {
        utils::ensure_binary(
            format!("{BINARY_DIR}{file}"),
            &Asset::get(&file).unwrap().data,
            ignore_if_exist,
        )?
    }
    Ok(())
}
