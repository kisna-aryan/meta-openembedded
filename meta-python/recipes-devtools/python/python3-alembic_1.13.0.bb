DESCRIPTION = "A database migration tool for SQLAlchemy"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3023b042cb6002cb398344b51c67093"

inherit pypi setuptools3

SRC_URI[sha256sum] = "ab4b3b94d2e1e5f81e34be8a9b7b7575fc9dd5398fccb0bef351ec9b14872623"

PYPI_PACKAGE = "alembic"

RDEPENDS:${PN} += "\
    ${PYTHON_PN}-dateutil \
    ${PYTHON_PN}-editor \
    ${PYTHON_PN}-mako \
    ${PYTHON_PN}-sqlalchemy \
    ${PYTHON_PN}-misc \
"

BBCLASSEXTEND = "native nativesdk"
