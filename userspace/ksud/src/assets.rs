use anyhow::Result;
use const_format::concatcp;
use rust_embed::RustEmbed;
use std::path::Path;

use crate::{defs::BINARY_DIR, utils};

pub const RESETPROP_PATH: &str = concatcp!(BINARY_DIR, "resetprop");
pub const BUSYBOX_PATH: &str = concatcp!(BINARY_DIR, "busybox");

#[derive(RustEmbed)]
#[folder = "bin/arm"]
struct Asset;

pub fn ensure_binaries(ignore_if_exist: bool) -> Result<()> {
    for file in Asset::iter() {
        let asset = Asset::get(&file).ok_or(anyhow::anyhow!("asset not found: {}", file))?;
        utils::ensure_binary(format!("{BINARY_DIR}{file}"), &asset.data, ignore_if_exist)?
    }
    Ok(())
}
