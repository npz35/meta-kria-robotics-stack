# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE
#   debian/copyright
#   debian/copyright-scan-patterns.yml
#   LICENSES/LGPL-2.1
#   LICENSES/GPL-2.0
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://LICENSE;md5=40ef17463fbd6f377db3c47b1cbaded8 \
                    file://debian/copyright;md5=fe39fa4621883cc08bc5bc10b263c659 \
                    file://debian/copyright-scan-patterns.yml;md5=0f6c255d9df1e570b7d4f9e21294324d \
                    file://LICENSES/LGPL-2.1;md5=9920968d0f2ff585ce61fae30344dd95 \
                    file://LICENSES/GPL-2.0;md5=e68f69a54b44ba526ad7cb963e18fbce"

SRC_URI = "https://salsa.debian.org/debian/ltt-control/-/archive/debian/${PV}/ltt-control-debian-${PV}.tar.gz"
SRC_URI[md5sum] = "415df2a0f80c02ef029cf8fe66abf3fb"
SRC_URI[sha256sum] = "57ffaf7e0249028d34d9e966075f4379fe90d0f1c1f629684189b2e4dc11eea5"

S = "${WORKDIR}/${BPN}-debian-${PV}"

# NOTE: the following prog dependencies are unknown, ignoring: xmlto python$PYTHON_VERSION-config fold pgrep man dtrace python-config asciidoc
# NOTE: unable to map the following pkg-config dependencies: liburcu-cds popt liburcu lttng-ust libxml-2.0 lttng-ust-ctl liburcu-bp
#       (this is based on recipes that have previously been built and packaged)
# NOTE: the following library dependencies are unknown, ignoring: pfm kmod rt c dl
#       (this is based on recipes that have previously been built and packaged)
DEPENDS = "flex-native swig-native bison-native popt liburcu lttng-ust libxml2"

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit pkgconfig python3native autotools

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = "--enable-python-bindings --disable-man-pages"

FILES:${PN}-dev += "\
  ${datadir}/xml/lttng/session.xsd \
  ${libdir}/lttng/libexec/lttng-consumerd \
  ${libdir}/python3.10/site-packages \
"

