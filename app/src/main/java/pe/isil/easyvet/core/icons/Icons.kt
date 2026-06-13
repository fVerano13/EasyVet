package pe.isil.easyvet.core.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

@Suppress("CheckReturnValue")
val favoriteBorder: ImageVector
    get() {
        if (_favoriteBorder != null) {
            return _favoriteBorder!!
        }
        _favoriteBorder =
            ImageVector.Builder(
                name = "favorite",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
            )
                .apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 1f,
                        stroke = null,
                        strokeAlpha = 1f,
                        strokeLineWidth = 1f,
                        strokeLineCap = StrokeCap.Butt,
                        strokeLineJoin = StrokeJoin.Bevel,
                        strokeLineMiter = 1f,
                        pathFillType = PathFillType.NonZero,
                    ) {
                        moveTo(12f, 21f)
                        lineTo(10.55f, 19.7f)
                        quadTo(8.03f, 17.43f, 6.38f, 15.78f)
                        quadTo(4.73f, 14.13f, 3.75f, 12.81f)
                        quadTo(2.78f, 11.5f, 2.39f, 10.4f)
                        reflectiveQuadTo(2f, 8.15f)
                        quadTo(2f, 5.8f, 3.58f, 4.22f)
                        reflectiveQuadTo(7.5f, 2.65f)
                        quadToRelative(1.3f, 0f, 2.48f, 0.55f)
                        reflectiveQuadTo(12f, 4.75f)
                        quadToRelative(0.85f, -1f, 2.03f, -1.55f)
                        reflectiveQuadTo(16.5f, 2.65f)
                        quadToRelative(2.35f, 0f, 3.93f, 1.57f)
                        reflectiveQuadTo(22f, 8.15f)
                        quadTo(22f, 9.3f, 21.61f, 10.4f)
                        reflectiveQuadToRelative(-1.36f, 2.41f)
                        quadToRelative(-0.97f, 1.31f, -2.63f, 2.96f)
                        quadToRelative(-1.65f, 1.65f, -4.17f, 3.92f)
                        lineTo(12f, 21f)
                        close()
                        moveToRelative(0f, -2.7f)
                        quadToRelative(2.4f, -2.15f, 3.95f, -3.69f)
                        reflectiveQuadTo(18.4f, 11.94f)
                        reflectiveQuadTo(19.65f, 9.91f)
                        quadTo(20f, 9.02f, 20f, 8.15f)
                        quadToRelative(0f, -1.5f, -1f, -2.5f)
                        reflectiveQuadToRelative(-2.5f, -1f)
                        quadToRelative(-1.17f, 0f, -2.17f, 0.66f)
                        quadTo(13.33f, 5.97f, 12.95f, 7f)
                        horizontalLineToRelative(-1.9f)
                        quadTo(10.68f, 5.97f, 9.68f, 5.31f)
                        reflectiveQuadTo(7.5f, 4.65f)
                        quadTo(6f, 4.65f, 5f, 5.65f)
                        reflectiveQuadTo(4f, 8.15f)
                        quadTo(4f, 9.02f, 4.35f, 9.91f)
                        reflectiveQuadTo(5.6f, 11.94f)
                        reflectiveQuadToRelative(2.45f, 2.67f)
                        reflectiveQuadTo(12f, 18.3f)
                        close()
                        moveToRelative(0f, -6.83f)
                        close()
                    }
                }
                .build()
        return _favoriteBorder!!
    }

private var _favoriteBorder: ImageVector? = null


@Suppress("CheckReturnValue")
val favoriteFilled: ImageVector
    get() {
        if (_favoriteFilled != null) {
            return _favoriteFilled!!
        }
        _favoriteFilled =
            ImageVector.Builder(
                name = "favorite",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
            )
                .apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 1f,
                        stroke = null,
                        strokeAlpha = 1f,
                        strokeLineWidth = 1f,
                        strokeLineCap = StrokeCap.Butt,
                        strokeLineJoin = StrokeJoin.Bevel,
                        strokeLineMiter = 1f,
                        pathFillType = PathFillType.NonZero,
                    ) {
                        moveTo(12f, 21f)
                        lineTo(10.55f, 19.7f)
                        quadTo(8.03f, 17.43f, 6.38f, 15.78f)
                        quadTo(4.73f, 14.13f, 3.75f, 12.81f)
                        quadTo(2.78f, 11.5f, 2.39f, 10.4f)
                        reflectiveQuadTo(2f, 8.15f)
                        quadTo(2f, 5.8f, 3.58f, 4.22f)
                        reflectiveQuadTo(7.5f, 2.65f)
                        quadToRelative(1.3f, 0f, 2.48f, 0.55f)
                        reflectiveQuadTo(12f, 4.75f)
                        quadToRelative(0.85f, -1f, 2.03f, -1.55f)
                        reflectiveQuadTo(16.5f, 2.65f)
                        quadToRelative(2.35f, 0f, 3.93f, 1.57f)
                        reflectiveQuadTo(22f, 8.15f)
                        quadTo(22f, 9.3f, 21.61f, 10.4f)
                        reflectiveQuadToRelative(-1.36f, 2.41f)
                        quadToRelative(-0.97f, 1.31f, -2.63f, 2.96f)
                        quadToRelative(-1.65f, 1.65f, -4.17f, 3.92f)
                        lineTo(12f, 21f)
                        close()
                    }
                }
                .build()
        return _favoriteFilled!!
    }

private var _favoriteFilled: ImageVector? = null

@Suppress("CheckReturnValue")
public val homeBorder: ImageVector
    get() {
        if (_homeBorder != null) {
            return _homeBorder!!
        }
        _homeBorder =
            ImageVector.Builder(
                name = "home",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
            )
                .apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 1f,
                        stroke = null,
                        strokeAlpha = 1f,
                        strokeLineWidth = 1f,
                        strokeLineCap = StrokeCap.Butt,
                        strokeLineJoin = StrokeJoin.Bevel,
                        strokeLineMiter = 1f,
                        pathFillType = PathFillType.Companion.NonZero,
                    ) {
                        moveTo(6f, 19f)
                        horizontalLineTo(9f)
                        verticalLineTo(13f)
                        horizontalLineToRelative(6f)
                        verticalLineToRelative(6f)
                        horizontalLineToRelative(3f)
                        verticalLineTo(10f)
                        lineTo(12f, 5.5f)
                        lineTo(6f, 10f)
                        verticalLineToRelative(9f)
                        close()
                        moveTo(4f, 21f)
                        verticalLineTo(9f)
                        lineTo(12f, 3f)
                        lineToRelative(8f, 6f)
                        verticalLineTo(21f)
                        horizontalLineTo(13f)
                        verticalLineTo(15f)
                        horizontalLineTo(11f)
                        verticalLineToRelative(6f)
                        horizontalLineTo(4f)
                        close()
                        moveToRelative(8f, -8.75f)
                        close()
                    }
                }
                .build()
        return _homeBorder!!
    }

private var _homeBorder: ImageVector? = null