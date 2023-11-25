DEPENDS:append = " swig-native"

EXTRA_OECONF += " --enable-python-bindings"

FILES:${PN} += "${libdir}/python3.10/site-packages/bt2*"
