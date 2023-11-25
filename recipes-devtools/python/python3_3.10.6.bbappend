DEPENDS:append:class-target = " tcl"

EXTRA_OECONF += " --enable-optimizations --disable-ipv6 --with-tcltk-includes='-I${STAGING_INCDIR} -I${STAGING_INCDIR}/tcl8.6' --with-tcltk-libs='-L${STAGING_LIBDIR}'"

PACKAGECONFIG:class-target = "readline tk gdbm ${@bb.utils.filter('DISTRO_FEATURES', 'lto', d)}"
