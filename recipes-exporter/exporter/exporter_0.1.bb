SUMMARY = "exporter recipe"
DESCRIPTION = "Recipe for the exporter"
LICENSE = "MIT"
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI = "file://exporter.yaml"

do_install() {
	install -d ${D}/root
	install -m 0644 ${WORKDIR}/exporter.yaml ${D}/root/
}

FILES:${PN} += "/root/exporter.yaml"
