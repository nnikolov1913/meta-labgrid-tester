SUMMARY = "exporter recipe"
DESCRIPTION = "Recipe for the exporter"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE;md5=72fdcd4eddb367c9bf934a2a3ed102ad"
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI = "file://exporter.yaml file://LICENSE"

do_install() {
	install -d ${D}/root
	install -m 0644 ${WORKDIR}/exporter.yaml ${D}/root/
}

FILES:${PN} += "/root/exporter.yaml"
