DESCRIPTION = "Ciao application"
SECTION = "ciao"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/zeppi-lin/ciao.git;protocol=https"

PV = "1.0+git${SRCPV}"
SRCREV = "40d69f426b84670fff96bf7edca7a730bf092781"

S = "${WORKDIR}/git"

do_compile () {
  oe_runmake
}

do_install () {
  install -d ${D}${bindir}
  install -m 0755 ciao ${D}${bindir}
}
